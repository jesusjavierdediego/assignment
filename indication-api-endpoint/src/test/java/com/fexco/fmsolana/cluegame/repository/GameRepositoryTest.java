package com.fexco.fmsolana.cluegame.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.fexco.fmsolana.cluegame.bean.game.Clue;
import com.fexco.fmsolana.cluegame.bean.game.Game;

public class GameRepositoryTest {

	@Test
	public void getGame() {
		String gameId = "gameId";
		Game game = GameRepository.getGame(gameId);

		assertNotNull(game);
		assertEquals("gameId", game.getGameId());

	}

	@Test
	public void testStarGame() throws Exception {
		String gameId = null;
		String userId = null;
		Clue clue = GameRepository.starGame(gameId, userId);
		assertNotNull(clue);
		assertEquals(1, clue.getId());
	}

}
