package idlestudio.emicalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.math.BigDecimal;

import idlestudio.emicalculator.common.EMIHelper;

/**
 * Created by ujain on 2/20/15.
 */
public class CalculatorFragment extends Fragment implements View.OnClickListener {

    View calculatorView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        calculatorView = inflater.inflate(R.layout.fragment_tab_one, container, false);
        Button resetButton = (Button) calculatorView.findViewById(R.id.resetButton);
        Button calculateButton = (Button) calculatorView.findViewById(R.id.calculateButton);
        resetButton.setOnClickListener(this);
        calculateButton.setOnClickListener(this);
        return calculatorView;
    }

    public void resetFields() {
        EditText amountET = (EditText) calculatorView.findViewById(R.id.amount);
        EditText interestET = (EditText) calculatorView.findViewById(R.id.rateOfInterest);
        EditText downPaymentET = (EditText) calculatorView.findViewById(R.id.downPayment);
        EditText tenureET = (EditText) calculatorView.findViewById(R.id.tenure);
        amountET.setText(null);
        interestET.setText(null);
        downPaymentET.setText(null);
        tenureET.setText(null);
    }

    public void calculateEMI() {
        EditText amountET = (EditText) calculatorView.findViewById(R.id.amount);
        EditText interestET = (EditText) calculatorView.findViewById(R.id.rateOfInterest);
        EditText downPaymentET = (EditText) calculatorView.findViewById(R.id.downPayment);
        EditText tenureET = (EditText) calculatorView.findViewById(R.id.tenure);

        BigDecimal principalAmount = new BigDecimal(amountET.getText().toString());
        Float interestRate = Float.parseFloat(interestET.getText().toString());
        BigDecimal downPayment = new BigDecimal(downPaymentET.getText().toString());
        int tenure = Integer.parseInt(tenureET.getText().toString());

        EMIHelper.calculateEMI(principalAmount, interestRate, downPayment, tenure);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.resetButton : resetFields();
                break;
            case R.id.calculateButton : calculateEMI();
        }
    }
}
