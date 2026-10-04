package I0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class o implements u {
    @Override // I0.u
    public StaticLayout a(v vVar) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(vVar.a, 0, vVar.f3906b, vVar.f3907c, vVar.f3908d);
        builderObtain.setTextDirection(vVar.f3909e);
        builderObtain.setAlignment(vVar.f3910f);
        builderObtain.setMaxLines(vVar.f3911g);
        builderObtain.setEllipsize(vVar.f3912h);
        builderObtain.setEllipsizedWidth(vVar.f3913i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(vVar.f3915k);
        builderObtain.setBreakStrategy(vVar.f3916l);
        builderObtain.setHyphenationFrequency(vVar.f3919o);
        builderObtain.setIndents(null, null);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 26) {
            p.a(builderObtain, vVar.f3914j);
        }
        if (i7 >= 28) {
            r.a(builderObtain, true);
        }
        if (i7 >= 33) {
            s.b(builderObtain, vVar.f3917m, vVar.f3918n);
        }
        return builderObtain.build();
    }
}
