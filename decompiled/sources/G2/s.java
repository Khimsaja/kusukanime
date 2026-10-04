package G2;

import androidx.lifecycle.V;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class s extends androidx.lifecycle.O {

    /* renamed from: c, reason: collision with root package name */
    public static final r f2731c = new r();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f2732b = new LinkedHashMap();

    @Override // androidx.lifecycle.O
    public final void d() {
        LinkedHashMap linkedHashMap = this.f2732b;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((V) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f2732b.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String string = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
