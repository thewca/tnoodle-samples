package com.foobar.mvp;

import org.worldcubeassociation.tnoodle.scrambles.Puzzle;
import org.worldcubeassociation.tnoodle.scrambles.PuzzleRegistry;

import java.util.Arrays;

public class ScrambleProvider {
    public static void main(String[] args) {
        PuzzleRegistry wcaModel = PuzzleRegistry.PYRA;
        //PuzzleRegistry wcaModel = PuzzleRegistry.THREE_NI;
        //PuzzleRegistry wcaModel = PuzzleRegistry.MEGA;

        Puzzle scrambler = wcaModel.getScrambler();

        String individualScramble = scrambler.generateScramble();
        System.out.println(individualScramble);

        String[] multipleScramblesAtOnce = scrambler.generateScrambles(3);
        System.out.println(Arrays.toString(multipleScramblesAtOnce));
    }
}
