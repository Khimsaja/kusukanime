package V3;

import P3.AbstractC0564e;
import java.io.Serializable;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class b extends AbstractC0564e implements a, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final Enum[] f9480k;

    public b(Enum[] enumArr) {
        l.f("entries", enumArr);
        this.f9480k = enumArr;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f9480k.length;
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r42 = (Enum) obj;
        l.f("element", r42);
        int iOrdinal = r42.ordinal();
        Enum[] enumArr = this.f9480k;
        l.f("<this>", enumArr);
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r42;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        Enum[] enumArr = this.f9480k;
        int length = enumArr.length;
        if (i7 < 0 || i7 >= length) {
            throw new IndexOutOfBoundsException(A6.b.e(i7, length, "index: ", ", size: "));
        }
        return enumArr[i7];
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        l.f("element", r52);
        int iOrdinal = r52.ordinal();
        Enum[] enumArr = this.f9480k;
        l.f("<this>", enumArr);
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r52) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r52 = (Enum) obj;
        l.f("element", r52);
        int iOrdinal = r52.ordinal();
        Enum[] enumArr = this.f9480k;
        l.f("<this>", enumArr);
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r52) {
            return iOrdinal;
        }
        return -1;
    }
}
