package F1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        i iVar = (i) obj;
        i iVar2 = (i) obj2;
        long j7 = iVar.f2195p;
        long j8 = iVar2.f2195p;
        return j7 - j8 == 0 ? iVar.compareTo(iVar2) : j7 < j8 ? -1 : 1;
    }
}
