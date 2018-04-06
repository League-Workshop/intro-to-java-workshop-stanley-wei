PImage catPic;
int x=455;
int y=260;
int acceleration=2;

void setup() {
  size(800,600);
  catPic=loadImage("cat.jpg");
  catPic.resize(800,600);
  background(catPic);
}

void draw() {
  if (true) {
    y-=2*acceleration;
    x-=2*acceleration;
  }
  fill(255,0,0);
  noStroke();
  ellipse(x,y,75,40);
  ellipse(x+140,y-5,65,40);
  if (x<=0 || y<=0) {
    background(catPic);
    x=445;
    y=260;
    acceleration=1;
  }
}

void keyPressed() {
  x--;
  y--;
}