/* Soot - a J*va Optimization Framework
 * Copyright (C) 2003 Ondrej Lhotak
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the
 * Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA 02111-1307, USA.
 */

package soot.jimple.spark;
import soot.*;
import soot.jimple.spark.queue.*;

/** Resolves virtual calls based on the actual type of the receiver.
 * @author Ondrej Lhotak
 */
public abstract class AbsVirtualCalls
{ 
    protected Rvar_obj pt;
    protected Rlocal_srcm_stmt_signature_kind receivers;
    protected Rlocal_srcm_stmt_tgtm specials;
    protected Qctxt_local_obj_srcm_stmt_kind_tgtm out;

    AbsVirtualCalls( Rvar_obj pt,
            Rlocal_srcm_stmt_signature_kind receivers,
            Rlocal_srcm_stmt_tgtm specials,
            Qctxt_local_obj_srcm_stmt_kind_tgtm out
        ) {
        this.pt = pt;
        this.receivers = receivers;
        this.specials = specials;
        this.out = out;
    }
    public abstract void update();
}

