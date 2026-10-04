package U4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum g implements InterfaceC0619p {
    NONE(0),
    INTERNAL_TO_CLASS_ID(1),
    DESC_TO_CLASS_ID(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f9275k;

    g(int i7) {
        this.f9275k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f9275k;
    }
}
