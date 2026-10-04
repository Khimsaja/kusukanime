package K;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import h0.C0998u;

/* loaded from: classes.dex */
public final class E extends RippleDrawable {

    /* renamed from: k, reason: collision with root package name */
    public final boolean f4353k;

    /* renamed from: l, reason: collision with root package name */
    public C0998u f4354l;

    /* renamed from: m, reason: collision with root package name */
    public Integer f4355m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f4356n;

    public E(boolean z7) {
        super(ColorStateList.valueOf(-16777216), null, z7 ? new ColorDrawable(-1) : null);
        this.f4353k = z7;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final Rect getDirtyBounds() {
        if (!this.f4353k) {
            this.f4356n = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        this.f4356n = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f4356n;
    }
}
