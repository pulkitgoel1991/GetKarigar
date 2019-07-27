package com.getconmedia.getkarigar.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.getconmedia.getkarigar.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FeedbackFrg_NavigationDrawer extends Fragment
{
    EditText et_Subject,et_Message;
    Button btn_Add_Feedback;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_feedback_frg__navigation_drawer, container, false);

        et_Subject=view.findViewById(R.id.edit_subject_feedbackfrg);
        et_Message=view.findViewById(R.id.edit_message_feedback);
        btn_Add_Feedback=view.findViewById(R.id.btnAdd_feedback);

        btn_Add_Feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String subject=et_Subject.getText().toString();
                String message=et_Message.getText().toString();

            }
        });
        return view;
    }

}
