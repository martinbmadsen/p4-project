package dk.aau.cs.d402f13.evaluation;

import dk.aau.cs.d402f13.values.Value;

public class Transition {
 State from, to;
 Value val;
  public Transition(State from, State to, Value val){
    this.from = from;
    this.to = to;
    this.val = val;
  }
}
