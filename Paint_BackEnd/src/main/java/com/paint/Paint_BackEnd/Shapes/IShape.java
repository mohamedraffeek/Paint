package com.paint.paint_backend.Shapes;

public class IShape {
    private int _x;
    private int _y;
    private String _stroke;
    private String _fill;
    private int _rotate;
    private boolean _draggable;
    private int _id;
    private String _type;


    public int get_x() {
        return _x;
    }

    public void set_x(int _x) {
        this._x = _x;
    }

    public int get_y() {
        return _y;
    }

    public void set_y(int _y) {
        this._y = _y;
    }

    public String get_stroke() {
        return _stroke;
    }

    public void set_stroke(String _stroke) {
        this._stroke = _stroke;
    }

    public String get_fill() {
        return _fill;
    }

    public void set_fill(String _fill) {
        this._fill = _fill;
    }

    public int get_rotate() {
        return _rotate;
    }

    public void set_rotate(int _rotate) {
        this._rotate = _rotate;
    }

    public boolean is_draggable() {
        return _draggable;
    }

    public void set_draggable(boolean _draggable) {
        this._draggable = _draggable;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_type() {
        return _type;
    }

    public void set_type(String _type) {
        this._type = _type;
    }
}