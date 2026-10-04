package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum Y implements InterfaceC0619p {
    IN(0),
    OUT(1),
    INV(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8348k;

    Y(int i7) {
        this.f8348k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8348k;
    }
}
