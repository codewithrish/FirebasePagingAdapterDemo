package com.collegediary.firebasepagingadapterdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ChatViewHolder extends RecyclerView.ViewHolder {

    private TextView message;

    public ChatViewHolder(View itemView) {
        super(itemView);

        message = itemView.findViewById(R.id.text);
    }

    public void setMessage(String message_s) {
        message.setText(message_s);
    }
}
