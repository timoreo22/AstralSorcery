/*******************************************************************************
 * HellFirePvP / Astral Sorcery 2018
 *
 * All rights reserved.
 * The source code is available on github: https://github.com/HellFirePvP/AstralSorcery
 * For further details, see the License file there.
 ******************************************************************************/

package hellfirepvp.astralsorcery.common.constellation.effect;

import hellfirepvp.astralsorcery.common.constellation.IMinorConstellation;
import hellfirepvp.astralsorcery.common.lib.Constellations;

/**
 * This class is part of the Astral Sorcery Mod
 * The complete source code for this mod can be found on github.
 * Class: ConstellationEffectProperties
 * Created by HellFirePvP
 * Date: 01.02.2018 / 19:14
 */
public class ConstellationEffectProperties {

    private double size;
    private double potency = 1;
    private double effectAmplifier = 1;
    private boolean corrupted = false;
    private double fracturationLower = 1F, fracturationRate = 1F;

    public ConstellationEffectProperties(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public double getPotency() {
        return potency;
    }

    public double getEffectAmplifier() {
        return effectAmplifier;
    }

    public boolean isCorrupted() {
        return corrupted;
    }

    public double getFracturationLowerBoundaryMultiplier() {
        return fracturationLower;
    }

    public double getFracturationRate() {
        return fracturationRate;
    }

    public ConstellationEffectProperties modify(IMinorConstellation trait) {
        if(trait != null) {
            if(trait.equals(Constellations.gelu)) {
                potency *= 0.25F;
                size *= 2.4F;
            }
            if(trait.equals(Constellations.ulteria)) {
                potency *= 0.9F;
                effectAmplifier *= 1.8F;
                size *= 0.4F;
            }
            if(trait.equals(Constellations.alcara)) {
                fracturationLower *= 0.005F;
                fracturationRate *= 15F;

                size *= 1.7F;
                effectAmplifier *= 1.8F;
                corrupted = true;
            }
            if(trait.equals(Constellations.vorux)) {
                fracturationLower *= 0.4F;
                fracturationRate *= 1.8F;

                effectAmplifier *= 1.6F;
                size *= 1.4F;
            }
        }
        return this;
    }

}