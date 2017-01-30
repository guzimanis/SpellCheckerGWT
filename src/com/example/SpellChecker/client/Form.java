package com.example.SpellChecker.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Form extends Composite implements HasText {

	private static FormUiBinder uiBinder = GWT.create(FormUiBinder.class);

	interface FormUiBinder extends UiBinder<Widget, Form> {
	}

	@UiField TextBox name;
	@UiField Button reset;
	@UiField Button check;
	@UiField Label nameFeedback;
	@UiField TextArea text;
	
	public Form() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public Form(String firstName) {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiHandler("check")
	void onCheck(ClickEvent e) {
		Window.alert("Checking your input...");
	}
	
	@UiHandler("reset")
	void onReset(ClickEvent e){
		RootPanel.get().clear();
		RootPanel.get().add(new Form());
	}

	@Override
	public String getText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setText(String text) {
		// TODO Auto-generated method stub
		
	}


}
