package p04_TirePressureMonitoringSystemTest;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import p04_TirePressureMonitoringSystem.Alarm;
import p04_TirePressureMonitoringSystem.Sensor;

import static org.mockito.Mockito.when;

public class AlarmTest {

    private static final double LOW_PRESSURE_VALUE = 12;
    private static final double HIGH_PRESSURE_VALUE = 50;
    private static final double NORMAL_PRESSURE_VALUE = 17;

    @Test
    public void testAlarmTurnsForLowPressure() {
        Sensor fakeSensorForLowPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForLowPressure.popNextPressurePsiValue()).thenReturn(LOW_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForLowPressure);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmTurnsForHighPressure() {
        Sensor fakeSensorForHighPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForHighPressure.popNextPressurePsiValue()).thenReturn(HIGH_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForHighPressure);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testAlarmIsOffForNormalPressure() {
        Sensor fakeSensorForNormalPressure = Mockito.mock(Sensor.class);
        when(fakeSensorForNormalPressure.popNextPressurePsiValue()).thenReturn(NORMAL_PRESSURE_VALUE);
        Alarm alarm = new Alarm(fakeSensorForNormalPressure);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }
}
