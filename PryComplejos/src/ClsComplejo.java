
public class ClsComplejo {

    private float _r, _i;
public ClsComplejo (){
    _r = 0;
    _i = 0;
    
}
public ClsComplejo (float r, float i){
    _r = r; 
    _i = i;
}

public ClsComplejo (ClsComplejo z){
    _r = z._r;
    _i = z._i;
}

public float r(){
    return _r;
}

public float i(){
    return _i;
}
public void r(float r){
    _r=r;
}
public void i(float i){
    _i=i;
}
public ClsComplejo suma(ClsComplejo b){
    ClsComplejo resp = new ClsComplejo();
    resp._r = b._r + this._r;
    resp._i = b._i + this._i;
    return resp;
}

public ClsComplejo resta(ClsComplejo b){
    ClsComplejo resp = new ClsComplejo();
    resp._r = b._r - this._r;
    resp._i = b._i - this._i;
    return resp;
}

public ClsComplejo por(ClsComplejo b){
    ClsComplejo resp = new ClsComplejo();
    resp._r =(b._r*this._r) - (b._i*this._i);
    resp._i =(b._r*this._i)+(b._i*this._r);
    return resp;
}
public ClsComplejo para (ClsComplejo b) {
   ClsComplejo resp = new ClsComplejo();
    resp._r =((b._r*this._r)+(b._i*this._i))/(b._r*b._r+ b._i* b._i);
    resp._i =((b._i*this._r)-(b._r*this._r))/(b._r*b._r+ b._i* b._i);
    
   return resp;
}

public ClsComplejo ala (int n) {
    ClsComplejo t= new ClsComplejo ();
    
    return t;
}

public String ver () {
    if (_i < 0){
        return _r + "  " + _i+ "i";
        }
    else{
    }    
    return _r+ " " + " + " + _i + "i";
}
   
}
