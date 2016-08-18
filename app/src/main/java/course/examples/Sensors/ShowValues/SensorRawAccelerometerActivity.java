package course.examples.Sensors.ShowValues;
import android.app.Activity;
import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import course.examples.Sensors.ShowValues.R;

// Android class for sensors
// exercise 1
public class SensorRawAccelerometerActivity extends Activity implements SensorEventListener{
    SensorManager mSensorManager;
    private Sensor mAccelerometer;
    private TextView mXValueView;
    private TextView mYValueView;
    private TextView mZValueView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        mSensorManager = (SensorManager)getSystemService(Context.SENSOR_SERVICE);
        mXValueView = (TextView) findViewById(R.id.x_value_view);
        mYValueView = (TextView) findViewById(R.id.y_value_view);
        mZValueView = (TextView) findViewById(R.id.z_value_view);
        if (null == (mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER))) {
            Log.d("SensorStatus","Accelerometer available");
        } else {
            Log.d("SensorStatus","Accelerometer unavailable");
        }
        doSomething(100.6F);

    }

    // Register listener
    @Override
    protected void onResume() {
        super.onResume();
        mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);
        //exercise 2


    }

    // Unregister listener
    //@Override
    protected void onPause() {
        mSensorManager.unregisterListener(this);

        super.onPause();
    }


    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) { // exercise 2

            mXValueView.setText(String.valueOf(x));
            mYValueView.setText(String.valueOf(y));
            mZValueView.setText(String.valueOf(z));
        }

    }

    //@Override //exercise 1
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Doing nothing
    }

    public boolean doSomething(float y) {
        // average of Y value readings
        //low pass filter, high pass filter,
        // store to sqlite, cloud

        // Doing nothing again
        return true;
    }
}