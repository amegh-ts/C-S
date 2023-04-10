import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class BackgroundColorActivity extends Activity {
Button b1;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_background);
    
    b1 = (Button) findViewById(R.id.button1);
    final RelativeLayout layout = (RelativeLayout) findViewById(R.id.RelativeLayout1);

    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            layout.setBackgroundColor(getResources().getColor(android.R.color.holo_yellow_dark));
        }
    });
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.background, menu);
    return true;
}
}