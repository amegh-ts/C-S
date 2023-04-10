import android.os.Bundle;
import android.widget.TextView;

public class IPActivity extends Activity {
TextView tvIP;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_ip);

    tvIP = (TextView) findViewById(R.id.text_view);

    String ipAddress = Formatter.formatIpAddress(NetworkInterface.getByName("wlan0").getInetAddresses().nextElement().hashCode());
    tvIP.setText("Your IP Address is: " + ipAddress);
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.ip_menu, menu);
    return true;
}
}