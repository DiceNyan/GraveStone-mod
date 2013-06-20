package GraveStone.models.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelRenderer;
import org.lwjgl.opengl.GL11;

/**
 * GraveStone mod
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 *
 */
@SideOnly(Side.CLIENT)
public class ModelDogStatueMemorial extends ModelGraveStone {

    /**
     * main box for the wolf head
     */
    private ModelRenderer wolfHeadMain;
    /**
     * The wolf's body
     */
    private ModelRenderer wolfBody;
    /**
     * Wolf'se first leg
     */
    private ModelRenderer wolfLeg1;
    /**
     * Wolf's second leg
     */
    private ModelRenderer wolfLeg2;
    /**
     * Wolf's third leg
     */
    private ModelRenderer wolfLeg3;
    /**
     * Wolf's fourth leg
     */
    private ModelRenderer wolfLeg4;
    /**
     * The wolf's mane
     */
    private ModelRenderer wolfMane;
    /**
     * The wolf's tail
     */
    ModelRenderer wolfTail;
    ModelRenderer Pedestal1;
    ModelRenderer Pedestal2;
    ModelRenderer Pedestal3;
    ModelRenderer Pedestal4;
    ModelRenderer Pedestal5;
    ModelRenderer Sign;

    public ModelDogStatueMemorial() {
        textureWidth = 64;
        textureHeight = 64;
        
        float f = 0.0F;
        float f1 = 13.5F;
        this.wolfHeadMain = new ModelRenderer(this, 0, 0);
        this.wolfHeadMain.addBox(-3.0F, -3.0F, -2.0F, 6, 6, 4, f);
        this.wolfHeadMain.setRotationPoint(-1.0F, f1, -7.0F);
        this.wolfBody = new ModelRenderer(this, 18, 14);
        this.wolfBody.addBox(-4.0F, -2.0F, -3.0F, 6, 9, 6, f);
        this.wolfBody.setRotationPoint(0.0F, 14.0F, 2.0F);
        this.wolfMane = new ModelRenderer(this, 21, 0);
        this.wolfMane.addBox(-4.0F, -3.0F, -3.0F, 8, 6, 7, f);
        this.wolfMane.setRotationPoint(-1.0F, 14.0F, 2.0F);
        this.wolfLeg1 = new ModelRenderer(this, 0, 18);
        this.wolfLeg1.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.wolfLeg1.setRotationPoint(-2.5F, 16.0F, 7.0F);
        this.wolfLeg2 = new ModelRenderer(this, 0, 18);
        this.wolfLeg2.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.wolfLeg2.setRotationPoint(0.5F, 16.0F, 7.0F);
        this.wolfLeg3 = new ModelRenderer(this, 0, 18);
        this.wolfLeg3.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.wolfLeg3.setRotationPoint(-2.5F, 16.0F, -4.0F);
        this.wolfLeg4 = new ModelRenderer(this, 0, 18);
        this.wolfLeg4.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.wolfLeg4.setRotationPoint(0.5F, 16.0F, -4.0F);
        this.wolfTail = new ModelRenderer(this, 9, 18);
        this.wolfTail.addBox(-1.0F, 0.0F, -1.0F, 2, 8, 2, f);
        this.wolfTail.setRotationPoint(-1.0F, 12.0F, 8.0F);
        this.wolfHeadMain.setTextureOffset(16, 14).addBox(-3.0F, -5.0F, 0.0F, 2, 2, 1, f);
        this.wolfHeadMain.setTextureOffset(16, 14).addBox(1.0F, -5.0F, 0.0F, 2, 2, 1, f);
        this.wolfHeadMain.setTextureOffset(0, 10).addBox(-1.5F, 0.0F, -5.0F, 3, 3, 4, f);

        Pedestal1 = new ModelRenderer(this, 0, 32);
        Pedestal1.addBox(0F, 0F, 0F, 16, 1, 16);
        Pedestal1.setRotationPoint(-8F, 23F, -8F);
        Pedestal1.setTextureSize(64, 64);
        Pedestal1.mirror = true;
        setRotation(Pedestal1, 0F, 0F, 0F);
        Pedestal2 = new ModelRenderer(this, 0, 32);
        Pedestal2.addBox(0F, 0F, 0F, 16, 1, 16);
        Pedestal2.setRotationPoint(-8F, 8F, -8F);
        Pedestal2.setTextureSize(64, 64);
        Pedestal2.mirror = true;
        setRotation(Pedestal2, 0F, 0F, 0F);
        Pedestal3 = new ModelRenderer(this, 0, 32);
        Pedestal3.addBox(0F, 0F, 0F, 14, 1, 14);
        Pedestal3.setRotationPoint(-7F, 22F, -7F);
        Pedestal3.setTextureSize(64, 64);
        Pedestal3.mirror = true;
        setRotation(Pedestal3, 0F, 0F, 0F);
        Pedestal4 = new ModelRenderer(this, 0, 32);
        Pedestal4.addBox(0F, 0F, 0F, 14, 1, 14);
        Pedestal4.setRotationPoint(-7F, 9F, -7F);
        Pedestal4.setTextureSize(64, 64);
        Pedestal4.mirror = true;
        setRotation(Pedestal4, 0F, 0F, 0F);
        Pedestal5 = new ModelRenderer(this, 0, 32);
        Pedestal5.addBox(0F, 0F, 0F, 12, 12, 12);
        Pedestal5.setRotationPoint(-6F, 10F, -6F);
        Pedestal5.setTextureSize(64, 64);
        Pedestal5.mirror = true;
        setRotation(Pedestal5, 0F, 0F, 0F);
        Sign = new ModelRenderer(this, 0, 56);
        Sign.addBox(0F, 0F, 0F, 10, 5, 1);
        Sign.setRotationPoint(-5F, 13F, -6.5F);
        Sign.setTextureSize(64, 64);
        Sign.mirror = true;
        setRotation(Sign, 0F, 0F, 0F);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are
     * used for animating the movement of arms and legs, where par1 represents
     * the time(so that arms and legs swing back and forth) and par2 represents
     * how "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float par2, float par3, float par4, float par5) {
        this.wolfHeadMain.rotateAngleX = -0.08F;

        this.wolfMane.setRotationPoint(-1.0F, 16.0F, -3.0F);
        this.wolfMane.rotateAngleX = ((float) Math.PI * 2F / 5F);
        this.wolfMane.rotateAngleY = 0.0F;
        this.wolfBody.setRotationPoint(0.0F, 18.0F, 0.0F);
        this.wolfBody.rotateAngleX = ((float) Math.PI / 4F);
        this.wolfLeg1.setRotationPoint(-2.5F, 22.0F, 2.0F);
        this.wolfLeg1.rotateAngleX = ((float) Math.PI * 3F / 2F);
        this.wolfLeg2.setRotationPoint(0.5F, 22.0F, 2.0F);
        this.wolfLeg2.rotateAngleX = ((float) Math.PI * 3F / 2F);
        this.wolfLeg3.rotateAngleX = 5.811947F;
        this.wolfLeg3.setRotationPoint(-2.49F, 17.0F, -4.0F);
        this.wolfLeg4.rotateAngleX = 5.811947F;
        this.wolfLeg4.setRotationPoint(0.51F, 17.0F, -4.0F);

        this.wolfTail.setRotationPoint(-1.0F, 21.0F, 6.0F);
        this.wolfTail.rotateAngleX = 1.7278761F;
    }

    @Override
    public void renderAll() {
        this.setRotationAngles(0.0625F, 0.0625F, 0.0625F, 0.0625F);
        float par7 = 0.0625F;

        Pedestal1.render(par7);
        Pedestal2.render(par7);
        Pedestal3.render(par7);
        Pedestal4.render(par7);
        Pedestal5.render(par7);
        Sign.render(par7);

        GL11.glTranslated(0, -1, 0.1);

        this.wolfHeadMain.renderWithRotation(par7);
        this.wolfBody.render(par7);
        this.wolfLeg1.render(par7);
        this.wolfLeg2.render(par7);
        this.wolfLeg3.render(par7);
        this.wolfLeg4.render(par7);
        this.wolfMane.render(par7);
        this.wolfTail.render(par7);
    }
}
