package hashtables;

import java.time.LocalDate;
import java.util.Objects;

public class CounterTerrorist {
    private int kills;
    private String name;
    private LocalDate lastGame;
    private float averageKills;

    public CounterTerrorist(int kills, String name, LocalDate lastGame, float averageKills) {
        this.kills = kills;
        this.name = name;
        this.lastGame = lastGame;
        this.averageKills = averageKills;
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 31 * hash + Integer.hashCode(kills);
        hash = 31 * hash + name.hashCode();
        hash = 31 * hash + lastGame.hashCode();
        hash = 31 * hash + Float.hashCode(averageKills);
        return hash;
    }
/*

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

 */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // kontrollo se a pointojne ne adrese te njejte
        // nese onbjekti qe vjen eshte null krahasohet me onjektin aktual
        // ose jane objete te clasave te ndryshme
        if (obj == null || getClass() != obj.getClass()) return false;
        return hashCode() == obj.hashCode();
    }
}









