package course.examples.Sensors.ShowValues;

/**
 * Created by jack on 7/24/2016.
 */
public class anotherClass {
    // exercise 1

    //tell android that you want to implement sensor functionality
    // public class SensorRawAccelerometerActivity extends Activity { //implements SensorEventListener


    // exercise 2

    // declare global variables for the Sensor Manager and the Accelerometer sensor
    //private SensorManager mSensorManager;
    //private Sensor mAccelerometer;

    // Get reference to SensorManager
    //mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);

    // Get reference to Accelerometer, also confirm its availability at runtime
        /*
        if (null == (mAccelerometer = mSensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER))) {
            Log.d("SensorStatus","Accelerometer available");
        } else {
            Log.d("SensorStatus","Accelerometer unavailable");
        }
        */

    // Register a sensor listener at the callback where the activity becomes visible
    //mSensorManager.registerListener(this, mAccelerometer, SensorManager.SENSOR_DELAY_UI);


    // Unregister the sensor listener at the callback where the activity is about to lose visibility
    // remember to unregister before the activity is paused
    //mSensorManager.unregisterListener(this);

    // on a sensor event, retrieve the values for the accelerometer
    //float x = event.values[0];
    //float y = event.values[1];
    //float z = event.values[2];



    // exercise 3

    // declare global variables for the TextView for each of X axis value, Y axis value, Z axis value
    //private TextView mXValueView;
    //private TextView mYValueView, mZValueView;
    //private TextView mZValueView;

    // assign the variables for the the TextView for each of X axis value, Y axis value, Z axis value
    // where the activity is created
    //mXValueView = (TextView) findViewById(R.id.x_value_view);
    //mYValueView = (TextView) findViewById(R.id.y_value_view);
    //mZValueView = (TextView) findViewById(R.id.z_value_view);

    // on a sensor event, after retrieving the values for the accelerometer, you then want to display set the display text
    // the retrieved values are of the float type, but are displayed as text, thus they should be converted
    //mXValueView.setText(String.valueOf(x));
    //mYValueView.setText(String.valueOf(y));
    //mZValueView.setText(String.valueOf(z));


    // perhaps you want to do something that requires more than retrieving raw sensor values
    //doSomething(y);

}
