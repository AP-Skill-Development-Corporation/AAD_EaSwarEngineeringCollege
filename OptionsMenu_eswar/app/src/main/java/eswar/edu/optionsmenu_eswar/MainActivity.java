package eswar.edu.optionsmenu_eswar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Menus : are common UserInterface component in many types of applications.
        * To familar and consistent user experience   you should  use the Menu API to
        *  present user actions and other options in your activities.
        * - Option Menu
        * -Context Menu
        * Pop-up Menu
        * Options Menu :  is  the primary collection of  menu items  for an activity
        * It s where  you should  place actions  that have a overall  impact on the
        *  apps.*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "You Selected Profile", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(this, "You Selected Settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                /*AlertDialogbox is a window that appears on top
                * of  the display interrupting the  flow of activity
                * Dialog class to show a standard dialog for an alert.*/
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Alertbox");
                builder.setIcon(R.drawable.electric_bike);
                builder.setMessage("Are you sure exit this app");
                builder.setCancelable(false);
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                       finish();
                    }
                });
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(MainActivity.this, "You Clicked on No", Toast.LENGTH_SHORT).show();
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
                Toast.makeText(this, "You Selected AlertDialog Box", Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                finish();
                Toast.makeText(this, "You Selected LogOut", Toast.LENGTH_SHORT).show();
                  break;
         }
        return super.onOptionsItemSelected(item);
    }
}