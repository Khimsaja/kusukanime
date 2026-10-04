package j3;

import java.io.Serializable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class S implements i3.h, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public final int f12297k;

    public S() {
        AbstractC1331q.b(2, "expectedValuesPerKey");
        this.f12297k = 2;
    }

    @Override // i3.h
    public final Object get() {
        return new ArrayList(this.f12297k);
    }
}
