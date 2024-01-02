package aa.bb.demonavigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
DrawerLayout drawer;
NavigationView navView;
TextView txt;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt=findViewById(R.id.txtTest);
        drawer=findViewById(R.id.myDrawar);
        navView=findViewById(R.id.MyNavigationView);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId() == R.id.act1) {

txt.setText("Bonjour action 1 ");


                }
                else if (item.getItemId() == R.id.act2) {
                    txt.setText("Bonjour action 2 ");
                }
                else if (item.getItemId() == R.id.act3) {
                    txt.setText("Bonjour action 3 ");


                }
                else {
                    finish();
                }

                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });

    }
}