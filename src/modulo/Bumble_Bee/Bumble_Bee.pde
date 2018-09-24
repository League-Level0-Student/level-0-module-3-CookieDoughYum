void setup(){
  size(500, 500);
}
void draw(){
  int size=450;
  for(int i=0; i<32; i++){
    ellipse(size-=15,size-=15,50,50);
    if(i%2==0){
     fill(#F0D611); 
    }
    else{
      fill(#080807);
    }
  }
}