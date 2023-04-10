import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.MenuItem;

public class ImageActivity extends Activity {
ImageView imgView;
Button btn1, btn2;
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_image);

    imgView = (ImageView) findViewById(R.id.imageView);
    btn1 = (Button) findViewById(R.id.button1);
    btn2 = (Button) findViewById(R.id.button2);

    btn1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            imgView.setImageResource(R.drawable.image1);
        }
    });

    btn2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View arg0) {
            imgView.setImageResource(R.drawable.image2);
        }
    });
}

@Override
public boolean onCreateOptionsMenu(Menu menu) {
    getMenuInflater().inflate(R.menu.image, menu);
    return true;
}
}