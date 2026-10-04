package I0;

import android.text.Layout;

/* loaded from: classes.dex */
public abstract class w {
    public static final Layout.Alignment a;

    /* renamed from: b, reason: collision with root package name */
    public static final Layout.Alignment f3920b;

    static {
        Layout.Alignment[] alignmentArrValues = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : alignmentArrValues) {
            if (kotlin.jvm.internal.l.a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (kotlin.jvm.internal.l.a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        a = alignment;
        f3920b = alignment2;
    }
}
