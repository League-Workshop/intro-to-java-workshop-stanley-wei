int x=50;
int y=50;
int xState=1;
int yState=1;
void setup () {
  size (1200,800);
  fill (#0000FF);
  rect (mouseX,650,300,50);
  fill (#FF0000);
  ellipse(x,y,100,200);
}

void draw () {
  background(#FFFFFF);
  fill (#0000FF);
  rect (mouseX,650,300,50);
  fill (#FF0000);
  ellipse(x,y,100,100);
  if (x==50){
    x=-x;
    y=-y;
  } else if (x==1150) {
    x=-x;
    y=-y;
  }
  if (y==50) {
    y=-y;
    x=-x;
  } else if ((y==600) && ((mouseX<=x)&&((mouseX+300)>=x))) {
    y=-y;
    x=-x;
  } else if (y==750) {
   y=y;
   x=x;
  }
  
}