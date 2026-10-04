package P3;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class n extends AbstractC0564e implements RandomAccess {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int[] f7768k;

    public n(int[] iArr) {
        this.f7768k = iArr;
    }

    @Override // P3.AbstractC0560a
    public final int a() {
        return this.f7768k.length;
    }

    @Override // P3.AbstractC0560a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Integer)) {
            return false;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f7768k;
        kotlin.jvm.internal.l.f("<this>", iArr);
        int length = iArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                i7 = -1;
                break;
            }
            if (iIntValue == iArr[i7]) {
                break;
            }
            i7++;
        }
        return i7 >= 0;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        return Integer.valueOf(this.f7768k[i7]);
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f7768k;
        kotlin.jvm.internal.l.f("<this>", iArr);
        int length = iArr.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (iIntValue == iArr[i7]) {
                return i7;
            }
        }
        return -1;
    }

    @Override // P3.AbstractC0560a, java.util.Collection
    public final boolean isEmpty() {
        return this.f7768k.length == 0;
    }

    @Override // P3.AbstractC0564e, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Number) obj).intValue();
        int[] iArr = this.f7768k;
        kotlin.jvm.internal.l.f("<this>", iArr);
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i7 = length - 1;
                if (iIntValue == iArr[length]) {
                    return length;
                }
                if (i7 < 0) {
                    break;
                }
                length = i7;
            }
        }
        return -1;
    }
}
