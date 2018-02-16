PImage mustache ;
PImage friend;
void setup (){
  friend = loadImage ("friend.jpg");
  size(800, 600);
  friend.resize(width,height);
mustache = loadImage("mustache.jpg");
 background(friend);
 
}
void draw(){
  image(mustache, 400, 300);
  if (mousePressed) {
  image( mustache ,mouseX,mouseY);
   background(friend);
}
}