
int x=(int) random(776);
int y=25;
int score=0;
int fishX=750;
boolean launched=false;


void setup() {
  size(800,600);
}

void draw() {
  if(score<10) {
  drawFish();
  y=y+10+score;
  noStroke();
  fill(255,0,0);
  ellipse(x,y,50,50);
  checkCatch();
  if (y>=600) {
    y=25;
    x=(int) random(776);
  }
  fill(0,0,0);
  textSize(16);
  text("Score: "+score,20,20);
  } else{
    fill(0,0,0);
   textSize(50);
   text("You win.",300,200);
  }
}

 void drawFish(){
   if (mousePressed && launched==false) {
     launched=true;
   }
   if (launched) {
     fishX=fishX-50;
     if (fishX<=0) {
       fishX=700;
       launched=false;
     }
   }
   
  background(141,233,237);
  noStroke();
  fill(255,255,255);
  ellipse(fishX-17,mouseY-17,20,20); //back side eye
  fill(255,200,88);
  ellipse(fishX,mouseY,90,50); //body
  triangle(fishX+30,mouseY,fishX+70,mouseY+30,fishX+70,mouseY-30); //tail
  stroke(0);
  triangle(fishX,mouseY,fishX+15,mouseY+10,fishX+15,mouseY-10); //side fin
  noStroke();
  fill(255,200,88);
  ellipse(fishX,mouseY,15,15); //side fin cover
  noStroke();
  fill(255,255,255);
  ellipse(fishX-25,mouseY-15,20,20); //front eye
  fill(0,0,0);
  ellipse(fishX-25,mouseY-15,5,5); //pupil
  fill(141,233,237);
  ellipse(fishX-45,mouseY,25,25);//mouth
   }


void checkCatch() {
  if (x>fishX && x<fishX+70) {
    if (y>mouseY && y<mouseY+30) {
      score++;
      println("Your score is now "+score);
      x=(int) random(776);
      y=25;
      } 
  }
}