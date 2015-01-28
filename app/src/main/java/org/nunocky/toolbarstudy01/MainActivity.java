package org.nunocky.toolbarstudy01;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.add(R.id.content, new MainFragment());
            ft.commit();
        }

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setupToolbar();
    }

    private void setupToolbar() {
        // Menu
        toolbar.inflateMenu(R.menu.menu_main);

        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                int id = menuItem.getItemId();
                if (id == R.id.action_settings) {
                    Toast.makeText(MainActivity.this, "settings clicked 2", Toast.LENGTH_SHORT).show();
                    return true;
                }
                return false;
            }
        });

        toolbar.setLogo(R.drawable.ic_launcher);
        toolbar.setTitle(getTitle());
        toolbar.setSubtitle("This is sub-title");
    }

    public static class MainFragment extends Fragment {
        public MainFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.fragment_main, container, false);

            Button btn;

            btn = (Button) v.findViewById(R.id.button);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), SecondActivity.class);
                    startActivity(intent);
                }
            });

            btn = (Button) v.findViewById(R.id.button2);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), ThirdActivity.class);
                    startActivity(intent);
                }
            });

            btn = (Button) v.findViewById(R.id.button3);
            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(getActivity(), ActionViewActivity.class);
                    startActivity(intent);
                }
            });


            return v;
        }
    }
}
