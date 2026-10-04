package P0;

import H0.l;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class f extends ClickableSpan {
    public final l a;

    public f(l lVar) {
        this.a = lVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.getClass();
    }
}
