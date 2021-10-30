package guild;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Guild {
    private final String name;
    private final int capacity;
    private List<Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        if (this.capacity > this.roster.size()) {
            roster.add(player);
        }
    }

    public boolean removePlayer(String name) {
        return roster.removeIf(r -> r.getName().equals(name));
    }

    public void promotePlayer(String name) {
        for (Player player : roster) {
            if (player.getName().equals(name)) {
                if (!player.getRank().equals("Member")) {
                    player.setRank("Member");
                }
            }
        }
    }

    public void demotePlayer(String name) {
        for (Player player : roster) {
            if (player.getName().equals(name)) {
                if (!player.getRank().equals("Trial")) {
                    player.setRank("Trial");
                }
            }
        }
    }

    public Player[] kickPlayersByClass(String clazz) {
        List<Player> removedPlayers = new ArrayList<>();
        for (Player player : roster) {
            if (player.getClazz().equals(clazz)) {
                removedPlayers.add(player);
            }
        }
        roster = roster.stream().filter(p -> !p.getClazz().equals(clazz)).collect(Collectors.toList());
        Player[] players = new Player[removedPlayers.size()];
        for (int i = 0; i < players.length; i++) {
            players[i] = removedPlayers.get(i);
        }

        return players;
    }

    public int count() {
        return roster.size();
    }

    public String report(){
        StringBuilder report = new StringBuilder();
        report.append(System.lineSeparator())
                .append("Players in the guild: ").append(this.name).append(":")
                .append(System.lineSeparator());

        roster.forEach(p -> report.append(p).append(System.lineSeparator()));

        return report.toString();
    }
}
