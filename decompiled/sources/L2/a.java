package L2;

import F.w;
import P3.q;
import android.os.Bundle;
import f1.AbstractC0870c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class a implements d {
    public final LinkedHashSet a;

    public a(w wVar) {
        l.f("registry", wVar);
        this.a = new LinkedHashSet();
        wVar.J("androidx.savedstate.Restarter", this);
    }

    @Override // L2.d
    public final Bundle a() {
        Bundle bundleH = AbstractC0870c.H((O3.l[]) Arrays.copyOf(new O3.l[0], 0));
        List listS0 = q.S0(this.a);
        bundleH.putStringArrayList("classes_to_restore", listS0 instanceof ArrayList ? (ArrayList) listS0 : new ArrayList<>(listS0));
        return bundleH;
    }
}
