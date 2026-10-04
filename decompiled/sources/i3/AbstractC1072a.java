package i3;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1072a implements e {
    public abstract boolean a(char c2);

    @Override // i3.e
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
