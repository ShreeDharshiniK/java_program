let particles=[];
function setup(){
    createMode(HSB, 360, 100, 100, 100);
    background(0);
    for(let i=0;i<10;i++){
        particles.push(new Particle(width/2,height/2));
    }
}
function draw(){
    for(let particle of particles){
        particle.update();
        particle.show();
    }
}
function mouseDragged(){
    for (let i=0;i<10;i++){
        particles.push(new Particle(mouseX, mouseY));
    }
}
class Particle{
    constructor(x,y){
        this.pos=createVector(x,y);
        this.baseHue= random(360);
       this.hueOffset=0;
       this.xOff=random(1000);
       this.yOff=random(1000);
    }
    update(){
        let angle=noise(this.xOff,this.yOff)*TWO_PI*2;
        let vel=p5.Vector.fromAngle(angle);
        vel.mult(0.2);
        this.pos.add(vel);
        this.xOff+=0.005;
        this.yOff+=0.005;
        this.hueOffset+=0.5;

    }
    show(){
        noStroke();
        let hue=(this.baseHue+this.hueOffset)%360;
        fill(hue,100,100,10);
        ellipse(this pos.x, this pos.y,10);
    }
}