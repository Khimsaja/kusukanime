package b0;

import android.view.autofill.AutofillManager;
import z0.C2471u;

/* renamed from: b0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0700a implements InterfaceC0701b {
    public final C2471u a;

    /* renamed from: b, reason: collision with root package name */
    public final g f10902b;

    /* renamed from: c, reason: collision with root package name */
    public final AutofillManager f10903c;

    public C0700a(C2471u c2471u, g gVar) {
        this.a = c2471u;
        this.f10902b = gVar;
        AutofillManager autofillManagerE = B5.a.e(c2471u.getContext().getSystemService(B5.a.B()));
        if (autofillManagerE == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.f10903c = autofillManagerE;
        c2471u.setImportantForAutofill(1);
    }
}
