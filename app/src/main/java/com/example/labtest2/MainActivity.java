package com.example.labtest2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

class color{
    public String name ;
    public color(String name){
        this.name = name ;
    }
    public String showColor() {
        return "The color is " + name + "\n";
    }

    public String getName() {
        return null;
    }
}

class Red extends color{
    public Red(String red){
        super("Red");
    }
}

class Green extends color{
    public Green(String green){
        super("Green");
    }
}

class blue extends color{
    public blue(String blue){
        super("Blue");
    }
}

class shape{
    public String name ;

    public shape(String name){
        this.name = name ;
    }

    public String showShape() {
        return "The shape is " + name + "\n" + "Area is " + area() + "\n" + "Perimeter is " + perimeter() + "\n";
    }

    public float area(){
        return 0;
    }

    public float perimeter(){
        return 0;
    }
}

class Circle extends shape{
    public  float radius ;

    public Circle(String circle, float radius) {
        super("Circle");
        this.radius = radius;
    }

    public float area(){
        return (float) (3.14 * radius * radius);
    }

    public float perimeter(){
        return (float) (2 * 3.14 * radius);
    }
}

class Square extends shape{
    public  float side_length ;

    public Square(String square, float side) {
        super("Square");
        this.side_length = side;
    }

    public float area(){
        return (side_length * side_length);
    }

    public float perimeter(){
        return (4 * side_length);
    }
}

class Triangle extends shape{
    public  float side1 , side2 , side3 ;

    public Triangle(String triangle, float side1 , float side2 , float side3) {
        super("Triangle");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float area(){
        float s = (side1 + side2 + side3) / 2;
        return (float) Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public float perimeter(){
        return (side1 + side2 + side3);
    }
}


public class MainActivity extends AppCompatActivity {

    public EditText ShapeEditText, ColorEditText ;
    public Button button ;
    public TextView ShapeTextView , ColorTextView ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ShapeEditText = findViewById(R.id.ShapeEditText);
        ColorEditText = findViewById(R.id.ColorEditText);
        button = findViewById(R.id.button);
        ShapeTextView = findViewById(R.id.ShapeTextView);
        ColorTextView = findViewById(R.id.ColorTextView);

        button.setOnClickListener(v -> {
            String shape = ShapeEditText.getText().toString();
            String color = ColorEditText.getText().toString() ;

            if(shape.equals("Circle")){
                Circle c = new Circle("circle", 5);
                ShapeTextView.setText(c.showShape());
            }
            else if(shape.equals("Square")){
                Square s = new Square("Square", 5);
                ShapeTextView.setText(s.showShape());
            }
            else if(shape.equals("Triangle")){
                Triangle t = new Triangle("Triangle", 3,4,5);
                ShapeTextView.setText(t.showShape());
            }
            else{
                ShapeTextView.setText("Invalid Shape");
            }

            if(color.equals("Red")){
                Red r = new Red("Red");
                ColorTextView.setText(r.showColor());
            }
            else if(color.equals("Green")){
                Green g = new Green("Green");
                ColorTextView.setText(g.showColor());
            }
            else if(color.equals("Blue")){
                blue b = new blue("Blue");
                ColorTextView.setText(b.showColor());
            }
            else{
                ColorTextView.setText("Invalid Color");
            }
        });
    }
}