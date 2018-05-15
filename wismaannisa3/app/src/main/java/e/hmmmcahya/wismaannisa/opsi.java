package e.hmmmcahya.wismaannisa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class opsi extends AppCompatActivity {
Button login1;
Button daftar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opsi);

        login1 = (Button)findViewById(R.id.btnlgn);
        login1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),login.class);
                view.getContext().startActivity(intent);}
        });
        daftar1 = (Button)findViewById(R.id.btndftr);
        daftar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(view.getContext(),daftar.class);
                view.getContext().startActivity(intent1);}
            });


    }
}
