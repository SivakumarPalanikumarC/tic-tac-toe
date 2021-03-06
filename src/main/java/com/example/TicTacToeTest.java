package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TicTacToeTest {
  @Test
  public void testValidBoardNoWinner() {
    TicTacToeBoard board = new TicTacToeBoard("O...X.X..");
    assertEquals(Evaluation.NoWinner, board.evaluate());
  }
}