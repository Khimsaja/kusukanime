package R4;

import X4.InterfaceC0619p;

/* loaded from: classes.dex */
public enum r implements InterfaceC0619p {
    CONCLUSION_CONDITION(0),
    RETURNS_CONDITION(1),
    HOLDSIN_CONDITION(2);


    /* renamed from: k, reason: collision with root package name */
    public final int f8603k;

    r(int i7) {
        this.f8603k = i7;
    }

    @Override // X4.InterfaceC0619p
    public final int a() {
        return this.f8603k;
    }
}
