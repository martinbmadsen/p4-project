package dk.aau.cs.d402f13.interpreter.stdenv.game.wrappers;

import dk.aau.cs.d402f13.interpreter.stdenv.game.GameEnvironment;
import dk.aau.cs.d402f13.utilities.errors.StandardError;
import dk.aau.cs.d402f13.utilities.gameapi.AddAction;
import dk.aau.cs.d402f13.utilities.gameapi.RemoveAction;
import dk.aau.cs.d402f13.utilities.gameapi.Square;
import dk.aau.cs.d402f13.values.Value;

public class RemoveActionWrapper extends UnitActionWrapper implements RemoveAction {

  private SquareWrapper from;
  
  public RemoveActionWrapper(GameEnvironment env, Value object) throws StandardError {
    super(env, object);
    from = new SquareWrapper(env, getMember("from", env.squareType()));
  }

  @Override
  public SquareWrapper getFrom() throws StandardError {
    return from;
  }
 

}