package e.hmmmcahya.wismaannisa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class splash extends AppCompatActivity {
//set waktu
    private static int splashinterval = 5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);
    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            // method
            Intent i = new Intent(splash.this,opsi.class);
            startActivity(i);//menghubugkn activity splash - opsi

            this.finish();
        }
        private void finish() {
            // TODO Auto-generated method stub

        }
    },splashinterval);
    };
}
