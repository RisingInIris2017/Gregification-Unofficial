/*
    Copyright 2020, decal06, dan
    Gregicality

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package gregification.opencomputers.values;

import gregification.opencomputers.InputValidator;
import gregtech.api.cover.CoverBehavior;
import gregtech.common.covers.CoverPump;
import li.cil.oc.api.machine.Arguments;
import li.cil.oc.api.machine.Callback;
import li.cil.oc.api.machine.Context;
import net.minecraft.util.EnumFacing;

public class ValueCoverPump extends ValueCoverBehavior {

    public ValueCoverPump(CoverPump coverBehavior, EnumFacing side) {
        super(coverBehavior, side, "gt_coverPump");
    }

    @Override
    protected CoverBehavior getCoverBehavior() {
        CoverBehavior cover = super.getCoverBehavior();
        return cover instanceof CoverPump ? cover : null;
    }

    @Callback(doc = "function():number --  Returns tier.")
    public Object[] getTier(final Context context, final Arguments args) {
        CoverBehavior cover = getCoverBehavior();
        if (cover == null) {
            return NULL_COVER;
        }

        return new Object[]{((CoverPump) cover).tier};
    }

    @Callback(doc = "function():number --  Returns transfer rate.")
    public Object[] getTransferRate(final Context context, final Arguments args) {
        CoverBehavior cover = getCoverBehavior();
        if (cover == null) {
            return NULL_COVER;
        }

        return new Object[]{((CoverPump) cover).getTransferRate()};
    }

    @Callback(doc = "function(number) --  Sets transfer rate.")
    public Object[] setTransferRate(final Context context, final Arguments args) {
        CoverBehavior cover = getCoverBehavior();
        if (cover == null) {
            return NULL_COVER;
        }

        int transferRate = InputValidator.getInteger(args, 0, 0, ((CoverPump) cover).maxFluidTransferRate);
        ((CoverPump) cover).setTransferRate(transferRate);
        return new Object[]{};
    }

    @Callback(doc = "function(mode:number) --  Sets pump mode. (0:IMPORT, 1:EXPORT)")
    public Object[] setPumpMode(final Context context, final Arguments args) {
        CoverBehavior cover = getCoverBehavior();
        if (cover == null) {
            return NULL_COVER;
        }

        int mode = InputValidator.getInteger(args, 0, 0, 1);
        ((CoverPump) cover).setPumpMode(CoverPump.PumpMode.values()[mode]);
        return new Object[]{};
    }

    @Callback(doc = "function():number --  Gets pump mode. (0:IMPORT, 1:EXPORT)")
    public Object[] getPumpMode(final Context context, final Arguments args) {
        CoverBehavior cover = getCoverBehavior();
        if (cover == null) {
            return NULL_COVER;
        }

        return new Object[]{((CoverPump) cover).getPumpMode().ordinal()};
    }
}
