//// Midterm code for 59CST112

/**************************************************************
BE SURE TO CHANGE THE NEXT SEVERAL LINES, USING YOUR REAL NAME.

    MY FIRST NAME IS......Anthony
    MY MIDDLE NAME IS.....Vito
    MY LAST NAME IS.......Mercurio
    
PICK 3 WORDS THAT START WITH YOUR INITIALS, using lower case letters:

    first word............apple
    second word...........vampire
    third word............metal
    
USE THESE 3 WORDS TO NAME ALL VARIABLES FOR 3 POOL BALLS.
(You may abbreviate any words, but start with same letter.)
***************************************************************/


//// GLOBALS FOR 3 colored balls ////
//// (Assume ball diameter is 30.) ////

float appleX,  appleY,  appleDX,  appleDY;          //++++ MODIFY THIS.  Don' use "wolf". ++++
float vampireX,  vampireY,  vampireDX,  vampireDY;              //++++ MODIFY THIS.  Don' use "ham". ++++
float metalX,  metalY,  metalDX,  metalDY;//++++ MODIFY THIS.  Don' use "hippo". ++++
float buttonX = width/4;
float buttonY = height/4;
float buttonW = 100;
float buttonH = 100;
            //++++ MODIFY THESE DECLARATIONS -- Do not use "wolf" or "ham" or "hippo" ++++


//// OTHER GLOBALS:  strings, pool table, etc ////

String title=  "CST112 MIDTERM EXAM";
String news=   "Click any ball to reset it to right half of table.  (r resets all.)";
String author=  "Anthony Mercurio";

float left=50, right=450, top=100, bottom=250;        // Table boundaries
float middle=250;
boolean wall=true;

int tableRed=150, tableGreen=250, tableBlue=150;      // green pool table
int score=0,m=0,k=0;

    // ADD YOUR OWN DECLARATIONS HERE. ++++


//// SETUP:  size and table
void setup() {
    size( 640, 480 );          //++++ CHANGE THE SIZE -- see instructions! ++++
  
    //// MODIFY THIS CODE TO MAKE TABLE CENTERED IN WINDOW.  ++++

    // Table boundaries 
    left=120;
    right=520;
    top=170;
    bottom=320;
    middle=250;
 }
 


//// NEXT FRAME:  table, bounce off walls, collisions, show all
void draw() {
  background( 250,250,200 );
  rectMode( CORNERS );
  table( left, top, right, bottom );
  buttons();
  bounce();
  collisions();
  show();
  messages();
}


//// HANDLERS:  keys, click
void keyPressed() {
  if (key == 'q') { exit();  }
    //++++ ADD YOUR OWN CODE HERE. ++++
}


//// SCENE:  draw the table with wall down the middle
void table( float east, float north, float west, float south ) {
  fill( tableRed, tableGreen, tableBlue );    // pool table
  strokeWeight(20);
  stroke( 127, 0, 0 );      // Brown walls
  rect( east-20, north-20, west+20, south+20 );

            //++++ MODIFY THIS CODE, as necessary. ++++

  // Start with a WALL down the middle of the table! 
  if (wall) {
    float middle=  (east+west)/2;    
    stroke( 0, 127, 0 );
    line( middle,north+10, middle,south-10 );
  }
  stroke(0);
  strokeWeight(1);
}

//// ACTION:  bounce off walls, collisions
void bounce() {
   appleX += appleDX;  
  if ( appleX<left || appleX>right ) appleDX *= -1;
  appleY += appleDY;  
  if ( appleY<top || appleY>bottom ) appleDY *=  -1;
 
  vampireX += vampireDX;  
  if ( vampireX<left || vampireX>right ) vampireDX *= -1;
  vampireY += vampireDY;  
  if ( vampireY<top || vampireY>bottom ) vampireDY *=  -1;
 
  metalX += metalDX; 
  if ( metalX<left || metalX>right ) metalDX *= -1;
  metalY += metalDY; 
  if ( metalY<top || metalY>bottom )metalDY *= -1;
}
    //// ADD YOUR OWN CODE HERE. ++++

void collisions() {
    //// ADD YOUR OWN CODE HERE. ++++
}


//// SHOW:  balls, messages, etc.
void show() {
   fill( 255, 255, 255 );    
  ellipse( appleX, appleY, 30, 30 );
  fill( 255, 0, 0 );    
  ellipse( appleX, appleY, 30, 30 );
  fill( 255, 255, 0 );  
  ellipse( vampireX, vampireY, 30, 30 );
  fill( 0, 0, 255 );    
  ellipse( metalX, metalY, 30, 30 );
    //++++ ADD YOUR OWN CODE HERE. ++++
}
void buttons() {
    //++++ ADD YOUR OWN CODE HERE. ++++
}
void messages() {
  fill(0);
  text( title, width/3, 15 );
  text( news, width/9, 30 );
  text( author, 10, height-5 );

  // Also, display the number of collisions.

    //++++ ADD YOUR OWN CODE HERE. ++++

}
