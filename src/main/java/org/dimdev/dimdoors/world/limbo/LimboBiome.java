//RIP LimboBiome - sometime in early 2020 to August 4
//
//package org.dimdev.dimdoors.world.limbo;
//
//import com.google.common.collect.ImmutableList;
//import org.dimdev.dimdoors.block.ModBlocks;
//import org.dimdev.dimdoors.entity.ModEntityTypes;
//import org.dimdev.dimdoors.sound.ModSoundEvents;
//
//import net.minecraft.entity.SpawnGroup;
//import net.minecraft.world.biome.Biome;
//import net.minecraft.world.biome.BiomeEffects;
//import net.minecraft.world.gen.surfacebuilder.SurfaceBuilder;
//import net.minecraft.world.gen.surfacebuilder.TernarySurfaceConfig;
//
//import net.fabricmc.api.EnvType;
//import net.fabricmc.api.Environment;
//
//public class LimboBiome extends Biome {
//    public LimboBiome() {
//        super(new Biome.Settings()
//                .configureSurfaceBuilder(
//                        SurfaceBuilder.DEFAULT,
//                        new TernarySurfaceConfig(
//                                ModBlocks.UNRAVELLED_FABRIC.getDefaultState(),
//                                ModBlocks.UNRAVELLED_FABRIC.getDefaultState(),
//                                ModBlocks.ETERNAL_FLUID.getDefaultState()
//                        )
//                )
//                .precipitation(Biome.Precipitation.NONE)
//                .category(Biome.Category.NETHER)
//                .depth(0.1F)
//                .scale(0.2F)
//                .temperature(2.0F)
//                .downfall(0.0F)
//                .effects(
//                        new BiomeEffects.Builder()
//                                .waterColor(0x000000)
//                                .waterFogColor(0x000000)
//                                .fogColor(0x000000)
//                                .loopSound(ModSoundEvents.CREEPY)
//                                .build()
//                )
//                .parent(null)
//                .noises(ImmutableList.of(new Biome.MixedNoisePoint(0.0F, 0.0F, 0.0F, -0.5F, 1.0F))));
//        this.addSpawn(SpawnGroup.MONSTER, new Biome.SpawnEntry(ModEntityTypes.MONOLITH, 1, 0, 1));
//    }
//
//    @Environment(EnvType.CLIENT)
//    @Override
//    public int getSkyColor() {
//        return 0x404040;
//    }
//}
