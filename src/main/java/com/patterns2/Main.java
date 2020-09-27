package com.patterns2;

import com.patterns2.adapter.CaramelAdapter;
import com.patterns2.adapter.Image;
import com.patterns2.adapter.ImageView;
import lombok.var;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());

        imageView.apply(new CaramelAdapter());
    }
}
