package tomerbu.edu.fragmentsdemos;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment implements View.OnClickListener {
    EditText etEmail, etPassword;
    Button btnLogin;

    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_login, container, false);
        etEmail = (EditText) v.findViewById(R.id.etEmail);
        etPassword = (EditText) v.findViewById(R.id.etPassword);
        btnLogin = (Button) v.findViewById(R.id.btnLogin);

        btnLogin.setOnClickListener(this);
        return v;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(), "Hello, " + etEmail.getText().toString(), Toast.LENGTH_SHORT).show();
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
