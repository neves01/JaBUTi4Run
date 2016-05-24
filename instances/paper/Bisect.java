/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package paper;

/**
 * Calcula a raíz quadrada de N usando o método de bisetriz.
 * Original code: http://www.inf-cr.uclm.es/www/mpolo/stvr/
 *
 * @author Jackson Antonio do Prado Lima <jacksonpradolima at gmail.com>
 * @version 1.0
 */
public class Bisect {

    double mEpsilon, mNumber, mResult;

    public Bisect() {
    }

    public void setEpsilon(double epsilon) {
        this.mEpsilon = epsilon;
    }

    public double sqrt(double N) {
        double x = N;
        double M = N, m = 1;
        double r = x;
        double diff = x * x - N;
        while (Math.abs(diff) > mEpsilon) {
            if (diff < 0) {
                m = x;
                x = (M + x) / 2;
            } else {
                if (diff > 0) {
                    M = x;
                    x = (m + x) / 2;
                }
            }
            diff = x * x - N;
        }
        r = x;
        mResult = r;
        return r;
    }
}